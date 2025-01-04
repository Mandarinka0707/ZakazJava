public enum StatusZakaza {
    REGISTERED ("Оформлен"),
    PAID("Оплачен"),
    TRANSIT("В доставке"),
    DELVERED("Доставлен");
    private String title;
    StatusZakaza(String title) {
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
