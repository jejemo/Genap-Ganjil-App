package com.maho.upi.ggapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TableRow
import android.widget.TextView


@Suppress("UNREACHABLE_CODE", "UNNECESSARY_SAFE_CALL")
class ListAdapter(private var activity: MainActivity, private var items:ArrayList<Model>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("not implemented")
        val view: View?
        val viewHolder: ViewHolder
        if(convertView == null){
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.gg_list, null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var model = items[position]
        viewHolder.txtNum?.text = model.Num.toString()
        viewHolder.txtBil?.text = model.Bil
        viewHolder.txtGG?.text = model.GG

        return view as View
    }

    override fun getItem(i: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return items[i]
    }

    override fun getItemId(i: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return i.toLong()
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return items.size
    }

    private class ViewHolder(row: View?){
        var txtNum : TextView? = null
        var txtBil : TextView? = null
        var txtGG : TextView? = null

        init {
            this.txtNum = row?.findViewById(R.id.txtnum)
            this.txtBil = row?.findViewById(R.id.txtbil)
            this.txtGG = row?.findViewById(R.id.txtgg)
        }
    }

}






/*
(private var items:ArrayList<ListAdapter>):RecyclerView.Adapter<ListAdapter.ViewHolder> {

    override fun onCreateViewHolder(p0: ViewGroup, viewType: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val itemView = LayoutInflater.from(p0?.context)
                .inflate(R.layout.gg_list, p0, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return items.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var listAdapte= items[position]
        holder?.txtNum?.text = Model.name
    }

    class ViewHolder(itemView: View) {
        var txtNum: TextView? = null
        var txtBil: TextView? = null
        var txtGG: TextView? = null


    }
}*/
