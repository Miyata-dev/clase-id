package com.example.eventhandling;

public class ID {
    private String generatedID;

    public ID(int indexRow, int indexColumn) {
        this.generatedID = indexRow + "" + indexColumn;
    }

    public String getGeneratedID() {
        return generatedID;
    }

    public static boolean isSameID(ID idUno, ID idDos) {
        return idUno.generatedID.compareTo(idDos.generatedID) == 0;
    }

    public static boolean isSameColumn(ID idUno, ID idDos) {
        char firstIDcolumnIndex = idUno.getGeneratedID().toCharArray()[1];
        char secondIDcolumnIndex = idDos.getGeneratedID().toCharArray()[1];

        return firstIDcolumnIndex == secondIDcolumnIndex;
    }

    @Override
    public String toString() {
        return "Row: " + generatedID.toCharArray()[0] + " Column: " + generatedID.toCharArray()[1];
    }
}