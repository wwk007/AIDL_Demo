// IBookManager.aidl
package com.example.ipc;

import com.example.ipc.Book;
import com.example.ipc.IOnNewBookArrivedListener;
interface IBookManager {
    List<Book> getBookList ();
    void addBook (in Book book);
    void registerListener (IOnNewBookArrivedListener listener);
    void unregisterListener (IOnNewBookArrivedListener listener);
}
