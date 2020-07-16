package com.example.mygame

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birds.*
import kotlinx.android.synthetic.main.activity_choose.view.*
import kotlin.Exception
import kotlinx.android.synthetic.main.activity_birds.imagebirdid as imagebirdid1

@Suppress("DEPRECATION")
class birds : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birds)
        Toast.makeText(this, "das", Toast.LENGTH_SHORT).show()
        var birdsName= arrayOf("ديك", "دجاجه","بطه")
        var birdsImg= arrayOf(R.drawable.deak,R.drawable.dgaga,R.drawable.bata)
        var birdsSoind = arrayOf(R.raw.deak,R.raw.dgaga,R.raw.batta)
        var index=0
        namebirdid.text=birdsName[index]
        imagebirdid1.setImageResource(birdsImg[index])
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, birdsSoind[index])

        btnbirdid.setOnClickListener{
            var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, birdsSoind[index])
            mediaPlayer?.start()
        }
    try {
        btnnextid.setOnClickListener {
            index++
            namebirdid.text = birdsName[index]
            imagebirdid1.setImageResource(birdsImg[index])
            btnbirdid.setOnClickListener {
                var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, birdsSoind[index])
                mediaPlayer?.start()
            }
        }
    }
    catch (e:Exception)
    {
        index=birdsName.size-1
    }

        try {
            btnbacktid.setOnClickListener {
                index--
                namebirdid.text = birdsName[index]
                imagebirdid1.setImageResource(birdsImg[index])
                btnbirdid.setOnClickListener {
                    var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, birdsSoind[index])
                    mediaPlayer?.start()
                }

            }
        }
        catch (e:Exception)
        {
            index=0
        }



    }
}