package gov.hocoboe.mibballotboxchainofcustody

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class RetrieveMain : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_retrieve_main, container, false)

        val dropboxButton = view.findViewById<Button>(R.id.dropbox_mib_button)
        val dropboxBinsButton = view.findViewById<Button>(R.id.dropbox_ballot_bin_button)
        val dropboxSig1Button = view.findViewById<Button>(R.id.dropbox_sig1_button)
        val dropboxSig2Button = view.findViewById<Button>(R.id.dropbox_sig2_button)
        val dropboxSubmitButton = view.findViewById<Button>(R.id.dropbox_submit_button)
        val dropboxBackButton = view.findViewById<Button>(R.id.dropbox_back_button)

        dropboxButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_retrieveMain_to_mailInBallotDropBox)
        }

        dropboxBinsButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_retrieveMain_to_retrieveBallotBins)
        }

        dropboxSig1Button.setOnClickListener {
            view.findNavController().navigate(R.id.action_retrieveMain_to_signature)
        }

        dropboxSig2Button.setOnClickListener {
            view.findNavController().navigate(R.id.action_retrieveMain_to_signature)
        }

        dropboxSubmitButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_retrieveMain_to_transfer)
        }

        dropboxBackButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_retrieveMain_to_transfer)
        }

        return view
    }
}