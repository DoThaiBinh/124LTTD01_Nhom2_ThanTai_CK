package com.example.ck_nhom2_thantai.object;

public class icon {
    private int index ;
    private Boolean isSelect;


    public icon(Boolean isSelect, int index) {
        this.isSelect = isSelect;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Boolean getSelect() {
        return isSelect;
    }

    public void setSelect(Boolean select) {
        isSelect = select;
    }
}
