package gov.hocoboe.mibballotboxchainofcustody

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class Register : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_register, container, false)
        val registerButton = view.findViewById<Button>(R.id.register_register_button)
        val backButton = view.findViewById<Button>(R.id.register_back_button)

        registerButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_register_to_login)
        }

        backButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_register_to_login)
        }

        return view
    }
}