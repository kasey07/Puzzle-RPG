package cs2114.puzzlerpg;

import java.util.Iterator;

/**
 *  A linked list implementation with index lookup.
 *
 *  @param <E> The type of each member.
 *
 *  @author andrew
 *  @version Apr 8, 2015
 */
public class LinkedList<E>
{
    private int size;
    private Node<E> head;

    /**
     * Construct a new empty list.
     */
    public LinkedList()
    {
        head = null;
        size = 0;
    }

    /**
     * Return the value at the given position.
     * @param index The given position.
     * @return The value at that position.
     */
    public E get(int index)
    {
        if (0 <= (size() - index))
        {
            return null;
        }
        else
        {
            Node<E> currentNode = head;
            for(int i = 0; i < size(); i++)
            {
                currentNode = head.getNext();
            }
            return currentNode.data();
        }
    }

    /**
     * Get the value of the first item.
     * @return value of first item.
     */
    public E first()
    {
        return get(0);
    }

    /**
     * Get the value of the last item.
     * @return value of last item
     */
    public E last()
    {
        return get(size() - 1);
    }

    /**
     * Get the size of the list.
     * @return Size of the list.
     */
    public int size()
    {
        //TODO
    }

    /**
     * Check if the list is empty.
     * @return true if empty otherwise false
     */
    public boolean isEmpty()
    {
        return size() == 0;
    }

    /**
     * Makes this the new element at the given index. The current
     * element at that index and all elements after it are moved
     * to accommodate the new value.
     * @newItem The new item.
     * @index The index to insert the new value before.
     */
    public void insert(E newItem, int index)
    {
        //TODO
    }

    /**
     * Insert a new value to the front of the list.
     * @newItem The new item.
     */
    public void insert(E newItem)
    {
        insert(newItem, 0);
    }

    /**
     * Delete the item at the given position.
     * @index The item to delete.
     * @return The value that was deleted.
     */
    public E delete(int index)
    {
        //TODO
    }

    /**
     * Used for iterating over the linked list.
     * @return An iterator for the values in the linked list.
     */
    public Iterator<E> iterator()
    {
        //TODO
    }

    /**
     * Linked list nodes.
     */
    private class Node<E>
    {
        private E value;
        private Node next;

        /**
         * Create a new node linked to null.
         */
        public Node(E value)
        {
            this.value = value;
            this.next = null;
        }

        /**
         * Return the data in the node.
         */
        public E data()
        {
            return value;
        }

        /**
         * Point the next node to the argument node.
         * @param next The new next node.
         */
        public void setNext(Node<E> next)
        {
            this.next = next;
        }

        /**
         * Return the next node or null if there
         * are no other nodes.
         * @return next node or null
         */
        public Node<E> getNext()
        {
            return next;
        }

    }
}
