package iuh.fit.bai03.entity;

public enum LoaiTienTe {
    USD("Tiền USD"),Euro("Tiền Euro"),VN("Tiền Việt Nam");

    private String name;

    private LoaiTienTe(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
