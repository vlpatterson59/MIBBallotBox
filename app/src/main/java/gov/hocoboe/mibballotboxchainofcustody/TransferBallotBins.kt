package gov.hocoboe.mibballotboxchainofcustody

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class TransferBallotBins : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_transfer_ballot_bins, container, false)

        val transportSigButton = view.findViewById<Button>(R.id.transfer_transport_sig_button)
        val receiveSigButton = view.findViewById<Button>(R.id.transfer_receive_sig_button)
        val transportSubmitButton = view.findViewById<Button>(R.id.transfer_submit_button)

        transportSigButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_transferBallotBins_to_signature)
        }

        receiveSigButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_transferBallotBins_to_signature)
        }

        transportSubmitButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_transferBallotBins_to_transfer)
        }

        return view
    }
}