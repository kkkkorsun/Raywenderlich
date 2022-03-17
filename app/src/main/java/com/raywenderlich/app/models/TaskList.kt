package com.raywenderlich.app.models

import android.os.Parcel
import android.os.Parcelable
import android.os.WorkSource

class TaskList(
    val name: String,
    val tasks: ArrayList<String> = ArrayList()
) : Parcelable {

    constructor(source: Parcel) : this(
        source.readString()!!,
        source.createStringArrayList()!!
    )

    override fun describeContents() = 0

    override fun writeToParcel(p0: Parcel, p1: Int) {
        p0.writeString(name)
        p0.writeStringList(tasks)
    }

    companion object CREATOR : Parcelable.Creator<TaskList> {
        override fun createFromParcel(parcel: Parcel): TaskList = TaskList(parcel)

        override fun newArray(size: Int): Array<TaskList?> = arrayOfNulls(size)
    }
}