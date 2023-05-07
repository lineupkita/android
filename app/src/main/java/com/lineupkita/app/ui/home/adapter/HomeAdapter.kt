package com.lineupkita.app.ui.home.adapter

import android.widget.ImageView
import com.lineupkita.app.data.remote.dummy.FestivalModel
import com.lineupkita.app.data.remote.dummy.Filter
import com.lineupkita.app.databinding.ItemFestivalBinding
import com.lineupkita.app.databinding.ItemFilterBinding
import com.lineupkita.app.util.ImageCornerOptions
import com.lineupkita.app.util.loadImage
import com.lineupkita.app.util.textOrNull
import com.lineupkita.newsapp.base.BaseAdapter


object HomeAdapter {

    val cityAdapter =
        BaseAdapter.adapterOf<Filter, ItemFilterBinding>(
            register = BaseAdapter.Register(
                onBindHolder = { _, item, view ->
                    view.run {
                        tvCity.textOrNull = item.title

                    }
                }
            ),
            diff = BaseAdapter.Diff(
                areItemsTheSame = { old, new -> old.id == new.id },
                areContentsTheSame = { old, new -> old == new }
            )
        )

    val festivalAdapter =
        BaseAdapter.adapterOf<FestivalModel, ItemFestivalBinding>(
            register = BaseAdapter.Register(
                onBindHolder = { _, item, view ->
                    view.run {
                        tvDate.textOrNull = item.date
                        tvTitlenameFestival.textOrNull = item.title
                        ivFestival.loadImage(
                            source = item.image,
                            scaleType = ImageView.ScaleType.CENTER_CROP,
                            radius = 8,
                            corner = ImageCornerOptions.ROUNDED
                        )

                    }
                }
            ),
            diff = BaseAdapter.Diff(
                areItemsTheSame = { old, new -> old.id == new.id },
                areContentsTheSame = { old, new -> old == new }
            )
        )


}