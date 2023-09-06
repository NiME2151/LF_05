package lf_05.ab.strukturierte_programmierung.spielwiese;

class Lotto {

    public static void main(String[] args) {
        LottoHelper lottoHelper = new LottoHelper();
        lottoHelper.printLotteryNumbersWithPossibleDoubles(true);
        lottoHelper.printLotteryNumbersWithPossibleDoubles(false);
    }
}
