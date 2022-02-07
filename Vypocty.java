/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author xnbejdo
 */
public class Vypocty {
    
    private Integer stavVypoctu;
    private String operand1;
    private String operand2;
    private String[] operace={"podil", "soucin", "rozdil", "soucet"};
    private Integer aktOperace;
    private Double vysledek;
    private Boolean pouzitaCarka;
    
    public Vypocty() {
        this.operand1 = "";
        this.operand2 = "";
        this.stavVypoctu = 0;
        this.aktOperace = -1;
        this.vysledek = 0.0;
    }

    /**
     * @return the stavVypoctu
     */
    public Integer getStavVypoctu() {
        return stavVypoctu;
    }

    /**
     * @param stavVypoctu the stavVypoctu to set
     */
    public void setStavVypoctu(Integer stavVypoctu) {
        this.stavVypoctu = stavVypoctu;
    }

    /**
     * @return the operand1
     */
    public String getOperand1() {
        return operand1;
    }

    /**
     * @param operand1 the operand1 to set
     */
    public void setOperand1(String operand1) {
        this.operand1 = operand1;
    }

    /**
     * @return the operand2
     */
    public String getOperand2() {
        return operand2;
    }

    /**
     * @param operand2 the operand2 to set
     */
    public void setOperand2(String operand2) {
        this.operand2 = operand2;
    }

    /**
     * @return the operace
     */
    public String[] getOperace() {
        return operace;
    }

    /**
     * @param operace the operace to set
     */
    public void setOperace(String[] operace) {
        this.operace = operace;
    }

    /**
     * @return the aktOperace
     */
    public Integer getAktOperace() {
        return aktOperace;
    }

    /**
     * @param aktOperace the aktOperace to set
     */
    public void setAktOperace(Integer aktOperace) {
        this.aktOperace = aktOperace;
    }

    /**
     * @return the vysledek
     */
    public Double getVysledek() {
        return vysledek;
    }

    /**
     * @param vysledek the vysledek to set
     */
    public void setVysledek(Double vysledek) {
        this.vysledek = vysledek;
    }
    
    public void setPouzitaCarka(Boolean pouzitaCarka) {
        this.pouzitaCarka = pouzitaCarka;
    }
    
    public Boolean getPouzitaCarka() {
        return pouzitaCarka;
    }
    
    public String zadavaniOperandu(String cislo) {
        String navrat = "";
        switch (this.getStavVypoctu()) {
            case 0:
                if (this.getOperand1().length() < 15) {
                    this.setOperand1(this.getOperand1() + cislo);
                    navrat = this.getOperand1();
                }
                break;
            case 1:
                if (this.getOperand2().length() < 15) {
                    this.setOperand2(this.getOperand2() + cislo);
                    navrat = this.getOperand2();
                }
                break;
        }
        return navrat;
    }
    
    public void provedOperaci() {
        if (this.getStavVypoctu() ==2) {
            switch (this.getAktOperace()) {
                case 0: this.vysledek = Double.parseDouble(this.operand1) / Double.parseDouble(this.operand2); break;
                case 1: this.vysledek = Double.parseDouble(this.operand1) * Double.parseDouble(this.operand2); break;
                case 2: this.vysledek = Double.parseDouble(this.operand1) - Double.parseDouble(this.operand2); break;
                case 3: this.vysledek = Double.parseDouble(this.operand1) + Double.parseDouble(this.operand2); break;
            }
        }
    }
    
    
}
