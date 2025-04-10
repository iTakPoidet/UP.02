public class mebel {
    private final String name;
    private final String komplect;
    private final String furma;
    private final String data;
    private final String naznach;
    private final String material;

    public mebel(String name, String komplect, String furma, String data, String naznach, String material) {
        this.name = name;
        this.komplect = komplect;
        this.furma = furma;
        this.data = data;
        this.naznach = naznach;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Название: " + getName() + " Комплектация: " + getKomplect() + " Фирма: " + getFurma() + " Год: " + getData() + " Назначение: " + getNaznach() + " Материал: " + getMaterial();
    }

    public String getName() {
        return name;
    }

    public String getKomplect() {
        return komplect;
    }

    public String getFurma() {
        return furma;
    }

    public String getData() {
        return data;
    }

    public String getNaznach() {
        return naznach;
    }

    public String getMaterial() {
        return material;
    }
}