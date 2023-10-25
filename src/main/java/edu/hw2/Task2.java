package edu.hw2;

class Rectangle {
    private int width;
    private int height;

    void setWidth(int width) {
        this.width = width;
    }

    void setHeight(int height) {
        this.height = height;
    }

    double area() {
        return width * height;
    }
}

class Square extends Rectangle {
    private int size;

    @Override
    void setWidth(int width) {
        throw new RuntimeException("Cannot be applied to a square, use setSize instead");
    }

    @Override
    void setHeight(int height) {
        throw new RuntimeException("Cannot be applied to a square, use setSize instead");
    }

    void setSize(int size) {
        this.size = size;
    }

    @Override
    double area() {
        return size * size;
    }
}

class Task2 {
    private Task2() {
    }
}
