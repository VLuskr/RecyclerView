package com.vluskr.myapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vluskr.myapplication.databinding.WorkItemBinding

class WorkAdapter : RecyclerView.Adapter<WorkHolder>() {

    var workList = ArrayList<Work>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkHolder {
        Log.d("MyLog", "fun OnCreateViewHolder")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.work_item, parent, false)
        return WorkHolder(view)
    }

    override fun onBindViewHolder(holder: WorkHolder, position: Int) {
        Log.d("MyLog", "holder: $holder, position: $position")
        holder.bind(workList[position])
    }

    override fun getItemCount(): Int {
        Log.d("MyLog", "workList.size = ${workList.size}")
        return workList.size
    }

    fun addWork(work: Work) {
        workList.add(work)
        Log.d("MyLog", "fun addWork. workList = $workList")
        notifyDataSetChanged()
    }

}

class WorkHolder(item: View) : RecyclerView.ViewHolder(item) {

    val binding = WorkItemBinding.bind(item)
    fun bind(work: Work) {
        Log.d("MyLog", "class WorkHolder, fun bind")
        binding.textView.text = work.name
    }
}


//var workList = ArrayList<Work>()
//
//override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkHolder {
//    val view = LayoutInflater.from(parent.context).inflate(R.layout.work_item,parent,false)
//    return WorkHolder(view)
//}
//
//override fun onBindViewHolder(holder: WorkHolder, position: Int) {
//    holder.bind(workList[position])
//}
//
//override fun getItemCount(): Int {
//    return workList.size
//}

//class WorkHolder(item: View) : RecyclerView.ViewHolder(item) {
//    val binding = WorkItemBinding.bind(item)
//    fun bind(work: Work) {
//        binding.textView.text = work.name
//    }