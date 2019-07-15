package exam.android.alcphase1

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class LabelAndTextView(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    private var labelText: CharSequence = ""
    private var valueText: CharSequence = ""

    private var labelView: TextView
    private var textValueView: TextView

    init {
        View.inflate(context, R.layout.label_and_text_layout, this)
        context.theme.obtainStyledAttributes(attrs, R.styleable.LabelAndTextView, 0, 0)
            .apply {
                try {
                    this@LabelAndTextView.labelText = this.getText(R.styleable.LabelAndTextView_label) ?: ""
                    this@LabelAndTextView.valueText = this.getText(R.styleable.LabelAndTextView_value) ?: ""
                } finally {
                    recycle()
                    this@LabelAndTextView.labelView = findViewById(R.id.label)
                    this@LabelAndTextView.textValueView = findViewById(R.id.text)

                    this@LabelAndTextView.labelView.text = this@LabelAndTextView.labelText
                    this@LabelAndTextView.textValueView.text = this@LabelAndTextView.valueText
                }
            }
    }


}