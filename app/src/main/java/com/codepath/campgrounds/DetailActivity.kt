package com.codepath.campgrounds

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "CampgroundDetailActivity"
const val CAMPGROUND_EXTRA = "CAMPGROUND_EXTRA"

class DetailActivity : AppCompatActivity() {
    private lateinit var campgroundNameTV: TextView
    private lateinit var campgroundDescriptionTV: TextView
    private lateinit var campgroundLatLongTV: TextView
    private lateinit var campgroundImageIV: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // enable Up (back) arrow in the toolbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // TODO: Find the remaining Views for the screen
        campgroundNameTV = findViewById(R.id.campgroundName)
        campgroundDescriptionTV = findViewById(R.id.campgroundDescription)
        campgroundLatLongTV = findViewById(R.id.campgroundLocation)
        campgroundImageIV = findViewById(R.id.campgroundImage)

        // TODO: Get the extra from the Intent
        val campground = intent.getSerializableExtra(CAMPGROUND_EXTRA) as? Campground

        // TODO:  Set the name, location, and description information
        campground?.let {
            campgroundNameTV.text = it.name
            campgroundDescriptionTV.text = it.description
            campgroundLatLongTV.text = it.latLong

            // TODO: Load the image using Glide
            Glide.with(this)
                .load(it.imageUrl)
                .into(campgroundImageIV)
        }
    }

    // handle Up (back) arrow click
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish() // close this activity and go back
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
