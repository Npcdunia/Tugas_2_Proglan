/**
 * kelas yang mempresentasikan berbagai atribut karakter seperti nama, atribut,hingga hp
 */
class Karakter implements TampilkanStat {
    private String name;
    private String atribut;
    private double CDM;
    private double CR;
    private int attack;
    private int defense;
    private int hp;

    /**
     * Konstruktor untuk membuat objek baru
     * @param name
     * @param atribut
     * @param CDM
     * @param CR
     * @param attack
     * @param defense
     * @param hp
     */

    Karakter(String name, String atribut, double CDM, double CR, int attack, int defense, int hp){
        this.setName(name);
        this.setAtribut(atribut);
        this.setCDM(CDM);
        this.setCR(CR);
        this.setAttack(attack);
        this.setDefense(defense);
        this.setHp(hp);
    }

    /**
     * Menampilkan informasi karakter
     */
    @Override
    public void displayinfo(){
        System.out.println("Nama Karakter   : "+ getName());
        System.out.println("Atribut         : "+ getAtribut());
        System.out.println("HP              : "+ getHp());
        System.out.println("ATK             : "+ getAttack());
        System.out.println("DEF             : "+ getDefense());
        System.out.println("Crit.Rate       : "+ getCR() + "%");
        System.out.println("Crit.DMG        : "+ getCDM() +"%");
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getAtribut() {
        return atribut;
    }

    /**
     *
     * @param atribut
     */
    public void setAtribut(String atribut) {
        this.atribut = atribut;
    }

    /**
     *
     * @return
     */
    public double getCDM() {
        return CDM;
    }

    /**
     *
     * @param CDM
     */
    public void setCDM(double CDM) {
        this.CDM = CDM;
    }

    /**
     *
     * @return
     */
    public double getCR() {
        return CR;
    }

    /**
     *
     * @param CR
     */
    public void setCR(double CR) {
        this.CR = CR;
    }

    /**
     *
     * @return
     */
    public int getAttack() {
        return attack;
    }

    /**
     *
     * @param attack
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     *
     * @return
     */
    public int getDefense() {
        return defense;
    }

    /**
     *
     * @param defense
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     *
     * @return
     */
    public int getHp() {
        return hp;
    }

    /**
     *
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
}
