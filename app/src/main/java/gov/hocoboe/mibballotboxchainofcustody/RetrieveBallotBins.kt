package gov.hocoboe.mibballotboxchainofcustody

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class RetrieveBallotBins : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_retrieve_ballot_bins, container, false)
        val ballotBinSubmitButton = view.findViewById<Button>(R.id.ballot_bins_submit_button)
        val ballotBinsBackButton = view.findViewById<Button>(R.id.ballot_bins_back_button)

        ballotBinSubmitButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_retrieveBallotBins_to_retrieveMain)
        }

        ballotBinsBackButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_retrieveBallotBins_to_retrieveMain)
        }

        return view
    }
}