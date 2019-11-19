package teja_123.example.android.ecomstatic.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import teja_123.example.android.ecomstatic.Adapters.CategoryAdapter
import teja_123.example.android.ecomstatic.Model.Categories
import teja_123.example.android.ecomstatic.R
import teja_123.example.android.ecomstatic.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter=CategoryAdapter(this,DataService.categories)
        mylist.adapter=adapter
    }
}
