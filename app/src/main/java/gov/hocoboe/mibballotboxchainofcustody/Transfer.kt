package gov.hocoboe.mibballotboxchainofcustody

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController

class Transfer : Fragment() {
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_transfer, container, false)

        val loggedInAs = TransferArgs.fromBundle(requireArguments()).loggedInAs
        val loggedInAsView = view.findViewById<TextView>(R.id.transfer_logged_in_textView)
        loggedInAsView.text = "Logged in as $loggedInAs"
        val retrieveButton = view.findViewById<Button>(R.id.transfer_retrieve_button)
        val transferButton = view.findViewById<Button>(R.id.transfer_transfer_button)

        retrieveButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_transfer_to_retrieveMain)
        }

        transferButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_transfer_to_transferBallotBins)
        }

        return view
    }
}