package edu.touro.mcon264.apps.collections;

import edu.touro.mcon264.IterableLinkedCollection;
import edu.touro.mcon264.support.LLNode;

public class LinkedBasedList <T> extends IterableLinkedCollection<T> implements ListInterface<T> {
    private void indexChecker(int index) {
        if (index < 0 || index >= numElements) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numElements);
        }
    }

    @Override
    public void add(int index, T element) throws IndexOutOfBoundsException {
        indexChecker(index);
        LLNode<T>  head = this.head;
        while (index-- > 0 && head != null) {
            head = head.getLink();
        }
        LLNode<T> newNode = new LLNode<>(element);
        if (head != null) {
            newNode.setLink(head.getLink());
            head.setLink(newNode);
        } else {
            this.head = newNode;
        }

    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        indexChecker(index);
        LLNode<T> head = this.head;
        while (index-- > 0 && head != null) {
            head =  head.getLink();
        }
        return head.getInfo();
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        indexChecker(index);
        LLNode<T> head = this.head;
        LLNode<T> previous = null;
        while (index-- > 0 && head != null) {
            previous = head;
            head = head.getLink();
        }
        if (previous != null) {
            previous.setLink(head.getLink());
        } else {
            this.head = head.getLink();
        }
        return head.getInfo();
    }

    @Override
    public int indexOf(T target) {
        LLNode<T> head = this.head;
        int index = 0;
        while (head != null) {
            index++;
            if (head.getInfo().equals(target)) {
                return index;
            }
            head = head.getLink();
        }
        return -1;
    }



    @Override
    public boolean set(int index, T element) throws IndexOutOfBoundsException {
        indexChecker(index);
        LLNode<T> head = this.head;
        while (index-- > 0 && head != null) {
            head = head.getLink();
        }
        head.setInfo(element);
        return true;
    }
}
