package teja_123.example.android.ecomstatic.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import teja_123.example.android.ecomstatic.Model.Categories
import teja_123.example.android.ecomstatic.R
import teja_123.example.android.ecomstatic.Services.DataService.categories

class CategoryAdapter(val context:Context,val  categories:List<Categories>): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var CategoryView:View
        CategoryView=LayoutInflater.from(context).inflate(R.layout.list,null)
        val imageview:ImageView=CategoryView.findViewById(R.id.imageView)
        val textview:TextView=CategoryView.findViewById(R.id.textView)

        val cat=categories[position]

        val resourceid=context.resources.getIdentifier(cat.image,"drawable",context.packageName)
        imageview.setImageResource(resourceid)
        textview.text=cat.title


        return CategoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
       return  categories.count()
    }
}