public class drobi {
    int znamn;
    int chisl;
    public  drobi(int chisl,int znamin){
        this.chisl=chisl;
        this.znamn=znamin;

    }

    public int getChisl() {
        return chisl;
    }

    public int getZnamin() {
        return znamn;
    }

    public drobi Sum(drobi other) {
        int newChisl=this.chisl* other.znamn+this.znamn* other.chisl;
        int newZnamn=this.znamn*other.znamn;
        return new drobi(newChisl,newZnamn);
    }
    public drobi Vichit(drobi other) {
        int newZnamn = this.znamn * other.getZnamin();
        int newChisl = this.chisl * other.getZnamin() - other.getChisl() * this.znamn;
        return new drobi(newChisl, newZnamn);
    }
    public drobi Umnog(drobi other) {
        int newChisl = this.chisl * other.getChisl();
        int newZnamin = this.znamn * other.getZnamin();
        return new drobi(newChisl, newZnamin);
    }
    public drobi Delenie(drobi other) {
        int newChisl = this.chisl * other.getZnamin();
        int newZnamin = this.znamn * other.getChisl();
        return new drobi(newChisl, newZnamin);
    }
}
