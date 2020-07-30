package android.bitpanda.presentation.dashboard

import android.bitpanda.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DashboardFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //
//        gender.setTabData(listOf("Male", "Female").toTypedArray())
//        MyApplication.userRegisterModel.gender = "MALE"
//        gender.setOnTabSelectListener(object : OnTabSelectListener {
//            override fun onTabSelect(position: Int) {
//                MyApplication.userRegisterModel.gender = if (position == 0) "MALE" else "FEMALE"
//            }
//
//            override fun onTabReselect(position: Int) {}
//        })

    }
}