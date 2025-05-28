package structures;

import exceptions.*;

public class StackArray<E> implements Stack<E>{
    private E[] array;
    private int tope;

    //se suprimio el warning causado por el casteo
    @SuppressWarnings("unchecked")
    public StackArray(int n){
        this.array = (E[])new Object[n];
        tope = -1;
    }

    @Override
    public void push(E x){
        if (isFull()){
            throw new ExceptionIsFull("El stack esta lleno");
        }
        array[++tope] = x;
    }

    @Override
    public E pop() throws ExceptionIsEmpty {
        if(isEmpty()){
            throw new ExceptionIsEmpty("El Stack está vacio");
        }
        E elemento = array[tope];
        array[tope--] = null;
        return elemento;
    }

    @Override
    public E top() throws ExceptionIsEmpty {
        if(isEmpty()){
            throw new ExceptionIsEmpty("El stack está vacío");
        }
        return array[tope];
    }
    
    public boolean isEmpty(){
        return this.tope == -1;
    }

    public boolean isFull(){
        return tope == array.length -1;
    }


}
