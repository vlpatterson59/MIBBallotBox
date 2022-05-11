package gov.hocoboe.mibballotboxchainofcustody

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class MailInBallotDropBox : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_mail_in_ballot_drop_box, container, false)
        val mibSubmitButton = view.findViewById<Button>(R.id.mib_submit_button)
        val mibBackButton = view.findViewById<Button>(R.id.mib_back_button)

        mibSubmitButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_mailInBallotDropBox_to_retrieveMain)
        }

        mibBackButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_mailInBallotDropBox_to_retrieveMain)
        }

        return view
    }
}