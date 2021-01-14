package com.codegym;

import com.codegym.ListFilter;
import com.codegym.ListPrinter;
import com.codegym.RandomList;

import java.util.List;

public class RandomListFacade {
    public void printRandomEvenList(){
        List<Integer> list=new RandomList().generateList(20,100,200);
        List<Integer> listOdd=new ListFilter().filterOdd(list);
        new ListPrinter().printList(listOdd);
    }
}
