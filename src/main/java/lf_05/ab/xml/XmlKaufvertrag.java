package lf_05.ab.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "kaufvertrag")
class XmlKaufvertrag {

    @XmlElement
    private Kaufvertrag kaufvertrag;

    public XmlKaufvertrag(Kaufvertrag kaufvertrag) {
        this.kaufvertrag = kaufvertrag;
    }

    public Kaufvertrag getKaufvertrag() {
        return kaufvertrag;
    }

    public void setKaufvertrag(Kaufvertrag kaufvertrag) {
        this.kaufvertrag = kaufvertrag;
    }
}
