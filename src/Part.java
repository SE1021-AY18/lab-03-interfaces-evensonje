/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Created: 12/14/2017
 * Author: Jake Evenson
 */

/**
 * An interface for parts, duplicates, and assemblies.
 */
public interface Part {
    double getCost();
    String getName();
    double getWeight();
    void printBillOfMaterials();
 }

