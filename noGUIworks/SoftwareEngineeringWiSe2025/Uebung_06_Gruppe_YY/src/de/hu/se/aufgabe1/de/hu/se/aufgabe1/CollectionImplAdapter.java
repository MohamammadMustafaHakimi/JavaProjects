package de.hu.se.aufgabe1;

public class CollectionImplAdapter implements CollectionIterator{
    private final CollectionImpl collectionImpl; // ein Instanz von collectionImpl;

    public CollectionImplAdapter(CollectionImpl collectionImpl) { // constructor zur Anlegen von ein instanz von dem Adapter
      this.collectionImpl = collectionImpl;
    }

    public boolean hasNext() { // Implementierung von hasMoreElements()
        return collectionImpl.hasMoreElements();
    }

    public String next() { // Implementierung von nextElement()
        return collectionImpl.nextElement();
    }
}
