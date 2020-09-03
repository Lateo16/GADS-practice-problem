package com.lateofrederick.practiceproject.ui.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lateofrederick.practiceproject.LearningLeadersRecyclerAdapter
import com.lateofrederick.practiceproject.R
import kotlinx.android.synthetic.main.fragment_learning_leaders.*

/**
 * A simple [Fragment] subclass.
 */
class LearningLeadersFragment : Fragment() {
    private lateinit var title: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = arguments?.getString("learning leaders").toString()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_learning_leaders, container, false)
        val leadersAdapter = LearningLeadersRecyclerAdapter(listOf<String>("Hello",
            "Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello"))
        val dividerItemDecoration = DividerItemDecoration(activity, DividerItemDecoration.HORIZONTAL)
        val recyclerAdapter: RecyclerView = root.findViewById(R.id.leaders_recycler)
        recyclerAdapter.adapter = leadersAdapter
        recyclerAdapter.layoutManager = LinearLayoutManager(activity)
        recyclerAdapter.addItemDecoration(dividerItemDecoration)
        return root
    }

    companion object {
         fun newInstance(): LearningLeadersFragment {
            return LearningLeadersFragment()
            }
        }
}
