/**
 * класс drobi-класс с реализайцией методов для сложения, вычитания,умножения,деления дробей
 * @author Сурушкин Д.С.
 */
public class drobi {
    /**Поле для хранения переменной znamn знамиенателя*/
    int znamn;
    /**Поле для хранения переменной chisl числителя*/
    int chisl;

    /**
     * Конструктор для дроби
     * @param chisl
     * @param znamin
     */
    public  drobi(int chisl,int znamin){
        this.chisl=chisl;
        this.znamn=znamin;
    }

    /**
     * @return возвращает переменную chisl
     */
    public int getChisl() {
        return chisl;
    }

    /**
     * @return возвращает переменную znamn
     */
    public int getZnamin() {
        return znamn;
    }

    /**
     * Метод для сложения дробей
     * @param other иная дробь
     * @return возвращает результат сложения дробей в виде другой дроби
     */
    public drobi Sum(drobi other) {
        int newChisl=this.chisl* other.znamn+this.znamn* other.chisl;
        int newZnamn=this.znamn*other.znamn;
        return new drobi(newChisl,newZnamn);
    }

    /**
     * Метод для вычитания дробей
     * @param other иная дробь
     * @return возвращает результат вычитания дробей в виде другой дроби
     */
    public drobi Vichit(drobi other) {
        int newZnamn = this.znamn * other.getZnamin();
        int newChisl = this.chisl * other.getZnamin() - other.getChisl() * this.znamn;
        return new drobi(newChisl, newZnamn);
    }

    /**
     * Метод для умножения дробей
     * @param other иная дробь
     * @return возвращает результат умножения дробей в виде другой дроби
     */
    public drobi Umnog(drobi other) {
        int newChisl = this.chisl * other.getChisl();
        int newZnamin = this.znamn * other.getZnamin();
        return new drobi(newChisl, newZnamin);
    }

    /**
     * Метод для деления дробей
     * @param other иная дробь
     * @return возвращает результат деления дробей в виде другой дроби
     */
    public drobi Delenie(drobi other) {
        int newChisl = this.chisl * other.getZnamin();
        int newZnamin = this.znamn * other.getChisl();
        return new drobi(newChisl, newZnamin);
    }
}
