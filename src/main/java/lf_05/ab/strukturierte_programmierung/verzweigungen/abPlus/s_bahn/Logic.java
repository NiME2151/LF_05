package lf_05.ab.strukturierte_programmierung.verzweigungen.abPlus.s_bahn;

import java.io.IOException;
import java.util.Locale;

import static lf_05.util.IO.readInt;
import static lf_05.util.IO.readString;
import static lf_05.util.NicoMath.charToInt;
import static lf_05.util.NumberFormatter.formatToCurrency;

class Logic {

    private String[][] tramLines;
    private String startStation, endStation;
    private double totalTicketPrice = 0.0;


    private void determineTramLinesCountAndEachLinesStationCount() throws IOException {
        System.out.print("Bitte geben Sie ein wie viele Bahnlinien vorhanden sind: ");
        int tramLineCount = readInt();
        System.out.print("Bitte geben Sie ein wie Stationen jede Bahnlinie besitzt: ");
        int stationCountPerTramLine = readInt();
        this.tramLines = new String[tramLineCount][stationCountPerTramLine];
    }

    private void numberTramLinesAndTramStations() {
        for (int line = 0; line < this.tramLines.length; line++) {
           for (int station = 0; station < tramLines[line].length; station++) {
               tramLines[line][station] =  String.valueOf(line + station);
           }
        }
    }
    
    private void determineStartAndEndStation() throws IOException {
        System.out.print("Bitte geben Sie die Station an, von der Sie starten möchten: ");
        this.startStation = readString();
        System.out.print("Bitte geben Sie die Endstation an: ");
        this.endStation = readString();
    }

    private void calculateTicketPrice() {
        if (charToInt(this.startStation.charAt(1)) == 3 && charToInt(this.endStation.charAt(1)) == 3) {
            if (charToInt(this.startStation.charAt(0)) == charToInt(this.endStation.charAt(0))+1 ||
                    charToInt(this.startStation.charAt(0)) == charToInt(this.endStation.charAt(0))-1) {
                this.totalTicketPrice = 1.0;
            }
            else {
                this.totalTicketPrice = 2.0;
            }
        }
        else if (((charToInt(this.startStation.charAt(1)) == charToInt(this.endStation.charAt(1))+1
                || charToInt(this.startStation.charAt(1)) == charToInt(this.endStation.charAt(1))-1)
                && this.startStation.charAt(0) == this.endStation.charAt(0))
                || ((this.startStation.equals("00") && charToInt(this.endStation.charAt(1)) == 1)
                || charToInt(this.startStation.charAt(1)) == 1 && this.endStation.equals("00"))) {
                this.totalTicketPrice = 1.0;
        }
        else {
            this.totalTicketPrice += 2.0;
            if ((charToInt(this.startStation.charAt(1)) < 3 && charToInt(this.endStation.charAt(1)) > 3) ||
                    (charToInt(this.startStation.charAt(1)) > 3 && charToInt(this.endStation.charAt(1)) < 3)) {
                this.totalTicketPrice++;
            }
            if (charToInt(this.endStation.charAt(1)) == 6) {
                this.totalTicketPrice++;
            }
            else {
                this.totalTicketPrice++;
            }
        }
    }

    public void run() throws IOException {
        determineTramLinesCountAndEachLinesStationCount();
        numberTramLinesAndTramStations();
        determineStartAndEndStation();
        calculateTicketPrice();
        System.out.println("Ausgewählte Fahrtstrecke: " + this.startStation + " -> " + this.endStation);
        System.out.println("Ticketkosten für diese Strecke: " + formatToCurrency(this.totalTicketPrice, Locale.GERMANY));
    }
}
