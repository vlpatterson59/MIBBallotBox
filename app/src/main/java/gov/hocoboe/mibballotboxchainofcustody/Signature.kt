package gov.hocoboe.mibballotboxchainofcustody

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class Signature : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_signature, container, false)
        // val sigClearButton = view.findViewById<Button>(R.id.sig_clear_button)
        val sigAcceptButton = view.findViewById<Button>(R.id.sig_accept_button)
        val sigBackButton = view.findViewById<Button>(R.id.sig_back_button)

        sigAcceptButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_signature_to_retrieveMain)
        }

        sigAcceptButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_signature_to_transferBallotBins)
        }

        sigBackButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_signature_to_retrieveMain)
        }

        sigBackButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_signature_to_transferBallotBins)
        }

        return view
    }
}