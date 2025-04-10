/**
 * Class reis
 */
public class reis {

    //
    // Fields
    //

    private final String marka_Avto;
    private final int nomer_Avto;
    private final String punkt_Naznach;
    private final int max_Gruz;
    private final int edin_Gruz;
    private final int total;

    //
    // Constructors
    //

    public reis(String marka_Avto, int nomer_Avto, String punkt_Naznach, int max_Gruz, int edin_Gruz, int total) {
        this.marka_Avto = marka_Avto;
        this.nomer_Avto = nomer_Avto;
        this.punkt_Naznach = punkt_Naznach;
        this.max_Gruz = max_Gruz;
        this.edin_Gruz = edin_Gruz;
        this.total = total;
    }
    //
    // Methods
    //

    @Override
    public String toString(){
      return "Марка автомобиля: " + getMarka_Avto() + " Номер автомобиля: " + getNomer_Avto()
              + " Пункт назначения: " + getPunkt_Naznach() + " Грузоподъемность: " + getMax_Gruz()
              + " Стоимосьт единицы груза: " + getEdin_Gruz() + " Стоимость всего груза: "
              + getTotal();
    }


    //
    // Accessor methods
    //

    /**
     * Get the value of marka_Avto
     *
     * @return the value of marka_Avto
     */
    public String getMarka_Avto() {
        return marka_Avto;
    }


    /**
     * Get the value of nomer_Avto
     *
     * @return the value of nomer_Avto
     */
    public int getNomer_Avto() {
        return nomer_Avto;
    }


    /**
     * Get the value of punkt_Naznach
     *
     * @return the value of punkt_Naznach
     */
    public String getPunkt_Naznach() {
        return punkt_Naznach;
    }


    /**
     * Get the value of max_Gruz
     *
     * @return the value of max_Gruz
     */
    public int getMax_Gruz() {
        return max_Gruz;
    }


    /**
     * Get the value of edin_Gruz
     *
     * @return the value of edin_Gruz
     */
    public int getEdin_Gruz() {
        return edin_Gruz;
    }


    /**
     * Get the value of total
     *
     * @return the value of total
     */
    public int getTotal() {
        return total;
    }

    //
    // Other methods
    //

}
