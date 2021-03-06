package com.eahm.motionlayoutexperiments.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eahm.motionlayoutexperiments.R

class Basics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basics)

        usingMotionLayout()
    }

    private fun usingMotionLayout(){
        /*
            Get Started!
            1. For androidX
               implementation 'androidx.constraintlayout:constraintlayout:2.0.0-beta1'
               1.1 For Android Support Library (No AndroidX):
                   implementation 'com.android.support.constraint:constraint-layout:2.0.0-beta1'

            2. Converting an existing ConstraintLayout into MotionLayout requires to create a
              separated file called: MotionScene. And must be in res->xml->activity_main_scene.xml
            3. Declare the file with the attribute> app:layoutDescription="@xml/activity_main_scene.xml
              in the root of your MotionLayout layout.

            4. Write all the motion related specifications in the MotionScene.

            Next: See activity_main_scene.xml to check attributes to build transition in the <MotionScene> tag

            Also See activity_main.xml to check the more additional attributes for <MotionLayout>


            Check out this repo for more project examples:
            https://github.com/android/views-widgets-samples/tree/master/ConstraintLayoutExamples

         */
    }

}