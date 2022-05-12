package gov.hocoboe.mibballotboxchainofcustody

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class Login : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val loginButton = view.findViewById<Button>(R.id.login_register_login_button)
        val registerButton = view.findViewById<Button>(R.id.login_register_register_button)
        val usernameView = view.findViewById<EditText>(R.id.login_username_editText)

        loginButton.setOnClickListener {
            val loggedInAs = usernameView.text.toString()
            val action = LoginDirections.actionLoginToTransfer(loggedInAs)
            view.findNavController().navigate(action)
        }

        registerButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_login_to_register)
        }

        return view
    }
}