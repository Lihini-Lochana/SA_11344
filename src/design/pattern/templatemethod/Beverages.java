package design.pattern.templatemethod;
public abstract class Beverages {
    boolean wantsExtras;
    final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        addExtras();
    }
    abstract void addExtras();

    void boilWater() {
        System.out.println("Boiling water");
    }
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
    abstract void brew();
    abstract void addCondiments();


    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }


}
