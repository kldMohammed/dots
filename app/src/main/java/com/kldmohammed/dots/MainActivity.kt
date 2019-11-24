package com.kldmohammed.dots

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.image_item.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagesList: ArrayList<Int> = ArrayList()
        imagesList.add(R.drawable.one)
        imagesList.add(R.drawable.two)
        imagesList.add(R.drawable.three)
        imagesList.add(R.drawable.four)
        imagesList.add(R.drawable.five)

        imageViewPager.adapter = ImagesAdapter(imagesList)
        dotsIndicator.setViewPager(imageViewPager)
    }

    class ImagesAdapter(private val media: ArrayList<Int>) : RecyclerView.Adapter<ImagesAdapter.PagerVH>() {
        class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH = PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false))

        override fun getItemCount() = media.size

        override fun onBindViewHolder(holder: PagerVH, position: Int) {
            holder.itemView.imageView.setImageResource(media[position])
        }

    }
}
