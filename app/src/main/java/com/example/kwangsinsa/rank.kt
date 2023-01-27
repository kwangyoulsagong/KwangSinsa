package com.example.kwangsinsa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class rank : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootview=inflater.inflate(R.layout.fragment_rank, container, false)
        var imagearr= arrayOf(
            R.drawable.o,
            R.drawable.e,
            R.drawable.r,
            R.drawable.q,
            R.drawable.u,
            R.drawable.d,
            R.drawable.a,
            R.drawable.l,

        )
        var numbertextarr= arrayOf<TextView>(
            rootview.findViewById(R.id.textView16),
            rootview.findViewById(R.id.textView17),
            rootview.findViewById(R.id.textView18),
            rootview.findViewById(R.id.textView19),
            rootview.findViewById(R.id.textView20),
            rootview.findViewById(R.id.textView38),
            rootview.findViewById(R.id.textView39),
            rootview.findViewById(R.id.textView40),

        )
        var imageviewarr = arrayOf(
            rootview.findViewById<ImageView>(R.id.imageView2),
            rootview.findViewById<ImageView>(R.id.imageView3),
            rootview.findViewById<ImageView>(R.id.imageView4),
            rootview.findViewById<ImageView>(R.id.imageView7),
            rootview.findViewById<ImageView>(R.id.imageView8),
            rootview.findViewById<ImageView>(R.id.imageView12),
            rootview.findViewById<ImageView>(R.id.imageView13),
            rootview.findViewById<ImageView>(R.id.imageView14),
        )
        for(i in imageviewarr.indices){
            imageviewarr[i].setImageResource(imagearr[i])
        }
        for(i in numbertextarr.indices){
            numbertextarr[i].setText("${i+1}")
        }

        return rootview
    }

}