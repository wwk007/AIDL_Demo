// IOnNewBookArrivedListener.aidl
package com.example.ipc;

// Declare any non-default types here with import statements

import com.example.ipc.Book;
interface IOnNewBookArrivedListener {
    void onNewBookArrived(in Book newBook);
}
