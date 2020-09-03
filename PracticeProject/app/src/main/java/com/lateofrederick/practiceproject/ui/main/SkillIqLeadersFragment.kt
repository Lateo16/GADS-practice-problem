package com.lateofrederick.practiceproject.ui.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.lateofrederick.practiceproject.R
import com.lateofrederick.practiceproject.SkillIqRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_skill_iq_leaders.*

/**
 * A simple [Fragment] subclass.
 */
class SkillIqLeadersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_skill_iq_leaders, container, false)
        val skillIqRecyclerAdapter = SkillIqRecyclerAdapter(listOf<String>(
            "Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello"
        ))
        val recyclerAdapter: RecyclerView = view.findViewById(R.id.skillIq_recycler)
        recyclerAdapter.adapter = skillIqRecyclerAdapter
        recyclerAdapter.layoutManager = LinearLayoutManager(activity)
        return view
    }

    companion object {
        fun newInstance(): SkillIqLeadersFragment {
            return SkillIqLeadersFragment()
        }
    }
}
