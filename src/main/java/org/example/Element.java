package org.example;

public class Element implements InterfaceForContainerElementClass {
    private final Integer elementSum;
    public Element(int elementSum) {
        this.elementSum = elementSum;
    }
    @Override
    public Integer getElementSum() {
        return elementSum;
    }
}
