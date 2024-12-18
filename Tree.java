import java.util.Collection;

public interface Tree<E> extends Collection<E> {
  
  /** Return true if the element is in the tree */
  public boolean search(E e);

  /** Insert element e into the binary tree
   * Return true if the element is inserted successfully */
  public boolean insert(E e);

  /** Delete the specified element from the tree
   * Return true if the element is deleted successfully */
  public boolean delete(E e);

  /** Get the number of elements in the tree */
  public int getSize();

  /** Inorder traversal from the root */
  public default void inorder() {
  }

  /** Postorder traversal from the root */
  public default void postorder() {
  }

  /** Preorder traversal from the root */
  public default void preorder() {
  }

  /** Return true if the tree is empty */
  @Override
  public default boolean isEmpty() {
    return getSize() == 0;
  }

  /** Return true if the tree contains the specified element */
  @Override
  public default boolean contains(Object e) {
    return search((E) e);
  }

  /** Add the specified element to the tree */
  @Override
  public default boolean add(E e) {
    return insert(e);
  }

  /** Remove the specified element from the tree */
  @Override
  public default boolean remove(Object e) {
    return delete((E) e);
  }

  /** Return the size of the tree */
  @Override
  public default int size() {
    return getSize();
  }

  /** Return true if the tree contains all elements in the collection */
  @Override
  public default boolean containsAll(Collection<?> c) {
    // Left as an exercise
    return false;
  }

  /** Add all elements from the collection to the tree */
  @Override
  public default boolean addAll(Collection<? extends E> c) {
    // Left as an exercise
    return false;
  }

  /** Remove all elements in the collection from the tree */
  @Override
  public default boolean removeAll(Collection<?> c) {
    // Left as an exercise
    return false;
  }

  /** Retain only the elements in the collection in the tree */
  @Override
  public default boolean retainAll(Collection<?> c) {
    // Left as an exercise
    return false;
  }

  /** Convert the tree elements to an array */
  @Override
  public default Object[] toArray() {
    // Left as an exercise
    return null;
  }

  /** Convert the tree elements to an array of the specified type */
  @Override
  public default <T> T[] toArray(T[] array) {
    // Left as an exercise
    return null;
  }
}

}