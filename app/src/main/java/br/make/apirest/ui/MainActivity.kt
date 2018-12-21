package br.make.apirest.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import br.make.apirest.R
import br.make.apirest.adapter.PostAdapter
import br.make.apirest.model.Post
import br.make.apirest.util.Dominios
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.net.URL

class MainActivity : AppCompatActivity() {

    var list: List<Post> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //addPosts()

        downloadData()

        listRecycler.layoutManager = LinearLayoutManager(this)
    }


    fun updateUI(){
        listRecycler.adapter = PostAdapter(list, this)
    }


    fun downloadData() {
        doAsync {
            val jsonString = URL(Dominios.URL_LISTAR_POSTS).readText()

            uiThread {
                var gson = Gson()
                list = gson.fromJson(jsonString, Array<Post>::class.java).toList()

                updateUI()
            }
        }
    }


    fun addPosts() {
        list = listOf(
            Post( "Guardians of the Galaxy Vol. 2 ", "2017"),
            Post( "Black Panther ", "2018"),
            Post( "Avengers: Endgame ", "2019"),
            Post( "Ant-Man ", "2015"),
            Post( "Aquaman ", "2019"),
            Post( "Iron Man ", "2008"),
            Post( "Doctor Strange ", "2016"),
            Post( "Spider-Man: Homecoming ", "2017"),
            Post( "Avengers: Infinity War ", "2018"),
            Post( "Thor: Ragnarok ", "2017"),
            Post( "Ant-Man and the Wasp ", "2018"),
            Post( "Captain Marvel ", "2019"),
            Post( "Guardians of the Galaxy Vol. 2 ", "2017"),
            Post( "Black Panther ", "2018"),
            Post( "Avengers: Endgame ", "2019"),
            Post( "Ant-Man ", "2015"),
            Post( "Aquaman ", "2019"),
            Post( "Iron Man ", "2008"),
            Post( "Doctor Strange ", "2016"),
            Post( "Spider-Man: Homecoming ", "2017"),
            Post( "Avengers: Infinity War ", "2018"),
            Post( "Thor: Ragnarok ", "2017"),
            Post( "Ant-Man and the Wasp ", "2018"),
            Post( "Captain Marvel ", "2019"),
            Post( "Guardians of the Galaxy Vol. 2 ", "2017"),
            Post( "Black Panther ", "2018"),
            Post( "Avengers: Endgame ", "2019"),
            Post( "Ant-Man ", "2015"),
            Post( "Aquaman ", "2019"),
            Post( "Iron Man ", "2008"),
            Post( "Doctor Strange ", "2016"),
            Post( "Spider-Man: Homecoming ", "2017"),
            Post( "Avengers: Infinity War ", "2018"),
            Post( "Thor: Ragnarok ", "2017"),
            Post( "Ant-Man and the Wasp ", "2018"),
            Post( "Captain Marvel ", "2019"),
            Post( "Guardians of the Galaxy Vol. 2 ", "2017"),
            Post( "Black Panther ", "2018"),
            Post( "Avengers: Endgame ", "2019"),
            Post( "Ant-Man ", "2015"),
            Post( "Aquaman ", "2019"),
            Post( "Iron Man ", "2008"),
            Post( "Doctor Strange ", "2016"),
            Post( "Spider-Man: Homecoming ", "2017"),
            Post( "Avengers: Infinity War ", "2018"),
            Post( "Thor: Ragnarok ", "2017"),
            Post( "Ant-Man and the Wasp ", "2018"),
            Post( "Captain Marvel ", "2019"),
            Post( "Guardians of the Galaxy Vol. 2 ", "2017"),
            Post( "Black Panther ", "2018"),
            Post( "Avengers: Endgame ", "2019"),
            Post( "Ant-Man ", "2015"),
            Post( "Aquaman ", "2019"),
            Post( "Iron Man ", "2008"),
            Post( "Doctor Strange ", "2016"),
            Post( "Spider-Man: Homecoming ", "2017"),
            Post( "Avengers: Infinity War ", "2018"),
            Post( "Thor: Ragnarok ", "2017"),
            Post( "Ant-Man and the Wasp ", "2018"),
            Post( "Captain Marvel ", "2019"),
            Post( "Guardians of the Galaxy Vol. 2 ", "2017"),
            Post( "Black Panther ", "2018"),
            Post( "Avengers: Endgame ", "2019"),
            Post( "Ant-Man ", "2015"),
            Post( "Aquaman ", "2019"),
            Post( "Iron Man ", "2008"),
            Post( "Doctor Strange ", "2016"),
            Post( "Spider-Man: Homecoming ", "2017"),
            Post( "Avengers: Infinity War ", "2018"),
            Post( "Thor: Ragnarok ", "2017"),
            Post( "Ant-Man and the Wasp ", "2018"),
            Post( "Captain Marvel ", "2019")
        )
        updateUI()
    }
}