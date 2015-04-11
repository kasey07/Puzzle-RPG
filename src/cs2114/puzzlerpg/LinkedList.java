package cs2114.puzzlerpg;

import java.util.Iterator;

/**
 * A linked list implementation with index lookup.
 *
 * @param <E>
 *            The type of each member.
 * @author andrew
 * @version Apr 8, 2015
 */
public class LinkedList<E>
{
    private Node<E> head;

    /**
     * Construct a new empty list.
     */
    public LinkedList()
    {
        head = null;
    }


    /**
<<<<<<< HEAD
     * Return the value at the given position. <<<<<<< HEAD
     *
     * @index The given position. =======
     * @param index
     *            The given position. >>>>>>> branch 'master' of
     *            https://github.com/kasey07/Puzzle-RPG.git
=======
     * Return the value at the given position.
     * @param index The given position.
>>>>>>> refs/remotes/origin/master
     * @return The value at that position.
     */
    public E get(int index)
    {

        Node<E> currentNode = head;
        for (int i = 0; i < index; i++)
        {
            if (head == null)
            {
                return null;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode.data();
>>>>>>> refs/remotes/origin/master
    }


    /**
     * Get the value of the first item.
     *
     * @return value of first item.
     */
    public E first()
    {
        return get(0);
    }


    /**
     * Get the value of the last item.
     *
     * @return value of last item
     */
    public E last()
    {
        return get(size() - 1);
    }


    /**
     * Get the size of the list.
     *
     * @return Size of the list.
     */
    public int size()
    {
<<<<<<< HEAD

        int accum = 0;
        Node<E> currentNode = head;
        while (currentNode != null)
=======
        int accum = 0;
        Node<E> currentNode = head;
        while(currentNode != null)
>>>>>>> refs/remotes/origin/master
        {
            currentNode = currentNode.getNext();
            accum++;
        }
        return accum;
    }


    /**
     * Check if the list is empty.
     *
     * @return true if empty otherwise false
     */
    public boolean isEmpty()
    {
        return size() == 0;
    }


    /**
<<<<<<< HEAD
     * <<<<<<< HEAD Makes this the new element at the given index. The current
     * element at that index and all elements after it are moved to accommodate
     * the new value.
     *
     * @newItem The new item.
     * @index The index to insert the new value before. ======= Makes this the
     *        new element at the given index. The current element at that index
     *        and all elements after it are moved to accommodate the new value.
     * @param newItem
     *            The new item.
     * @param index
     *            The index to insert the new value before. >>>>>>> branch
     *            'master' of https://github.com/kasey07/Puzzle-RPG.git
=======
     * Makes this the new element at the given index. The current
     * element at that index and all elements after it are moved
     * to accommodate the new value.
     * @param newItem The new item.
     * @param index The index to insert the new value before.
>>>>>>> refs/remotes/origin/master
     */
    public void insert(E newItem, int index)
    {
        // TODO
    }


    /**
<<<<<<< HEAD
     * Insert a new value to the front of the list. <<<<<<< HEAD
     *
     * @newItem The new item. =======
     * @param newItem
     *            The new item. >>>>>>> branch 'master' of
     *            https://github.com/kasey07/Puzzle-RPG.git
=======
     * Insert a new value to the front of the list.
     * @param newItem The new item.
>>>>>>> refs/remotes/origin/master
     */
    public void insert(E newItem)
    {
        insert(newItem, 0);
    }


    /**
<<<<<<< HEAD
     * Delete the item at the given position. <<<<<<< HEAD
     *
     * @index The item to delete. =======
     * @param index
     *            The item to delete. >>>>>>> branch 'master' of
     *            https://github.com/kasey07/Puzzle-RPG.git
=======
     * Delete the item at the given position.
     * @param index The item to delete.
>>>>>>> refs/remotes/origin/master
     * @return The value that was deleted.
     */
    public E delete(int index)
    {
<<<<<<< HEAD

        if (index == 0)
        {
            Node<E> temp = head;
            head = null;
            return temp.data();
        }
        else
        {
            Node<E> lastNode = null;
            Node<E> currentNode = head;
            for (int i = 0; i < index; i++)
            {
                if (currentNode == null)
                {
                    // TODO List too short, blow up.
=======
        if (index == 0)
        {
            Node<E> temp = head;
            head = null;
            return temp.data();
        }
        else
        {
            Node<E>lastNode = null;
            Node<E>currentNode = head;
            for (int i = 0; i < index; i++)
            {
                if (currentNode == null)
                {
                    //TODO List too short, blow up.
>>>>>>> refs/remotes/origin/master
                }
                lastNode = currentNode;
                currentNode = currentNode.getNext();
            }
            lastNode.setNext(currentNode.getNext());
            return currentNode.data();
        }
    }


    /**
     * Used for iterating over the linked list.
     *
     * @return An iterator for the values in the linked list.
     */
    public Iterator<E> iterator()
    {
        return null;
    }


    /**
     * Linked list nodes.
     */
    private class Node<E>
    {
        private E       value;
        private Node<E> next;


        /**
         * Create a new node linked to null.
         */
        public Node(E value)
        {
            this.value = value;
            this.next = null;
        }


        /**
         * Point the next node to the argument node.
         *
         * @param next
         *            The new next node.
         */
        public void setNext(Node<E> next)
        {
            this.next = next;
        }


        /**
         * Return the next node or null if there are no other nodes.
         *
         * @return next node or null
         */
        public Node<E> getNext()
        {
            return next;
        }


        /**
         * Get the datum in the node.
         *
         * @return The datum.
         */
        public E data()
        {
            return value;
        }

    }

    /**
     * Linked list nodes.
     */
    private class Node<E>
    {
        private E value;
        private Node<E> next;

        /**
         * Create a new node linked to null.
         */
        public Node(E value)
        {
            this.value = value;
            this.next = null;
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

        /**
         * Get the datum in the node.
         * @return The datum.
         */
        public E data()
        {
            return value;
        }

    }
}
