/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\workspace\\LastMusic\\src\\cn\\edu\\xmu\\software\\IPlayNext.aidl
 */
package cn.edu.xmu.software;
import java.lang.String;

import android.os.IBinder;
import android.os.RemoteException;

public interface IPlayNext extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cn.edu.xmu.software.IPlayNext
{
private static final java.lang.String DESCRIPTOR = "cn.edu.xmu.software.IPlayNext";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IPlayNext interface,
 * generating a proxy if needed.
 */
public static cn.edu.xmu.software.IPlayNext asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
cn.edu.xmu.software.IPlayNext in = (cn.edu.xmu.software.IPlayNext)obj.queryLocalInterface(DESCRIPTOR);
if ((in!=null)) {
return in;
}
return new cn.edu.xmu.software.IPlayNext.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags)
{
try {
switch (code)
{
case TRANSACTION_playNext:
{
this.playNext();
return true;
}
}
}
catch (android.os.DeadObjectException e) {
}
try {
	return super.onTransact(code, data, reply, flags);
} catch (RemoteException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return false;
}
private static class Proxy implements cn.edu.xmu.software.IPlayNext
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public void playNext() throws android.os.DeadObjectException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
mRemote.transact(Stub.TRANSACTION_playNext, _data, null, 0);
} catch (RemoteException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_playNext = (IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void playNext() throws android.os.DeadObjectException;
}
