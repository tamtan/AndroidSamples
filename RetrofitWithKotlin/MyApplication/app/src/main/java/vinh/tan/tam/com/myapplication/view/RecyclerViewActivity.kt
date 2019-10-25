package vinh.tan.tam.com.myapplication.view

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
import kotlinx.android.synthetic.main.activity_recycler_view.*
import vinh.tan.tam.com.myapplication.R
import vinh.tan.tam.com.myapplication.model.Repos

class RecyclerViewActivity : AppCompatActivity() {

    private val layoutResId: Int
        @LayoutRes
        get() = R.layout.activity_recycler_view

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResId)

        rvList.apply {
            layoutManager = GridLayoutManager(this.context, 3)
            adapter = ListAdapter(Repos.nicCageMovies)
        }
    }


}
