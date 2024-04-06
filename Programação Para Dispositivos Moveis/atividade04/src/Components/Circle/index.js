import React from "react";
import { View } from "react-native";
import styles from './style'

export default function CircleTitle() {

    return (

            <View style={styles.boxCircle}>
                <View style={styles.circle}>

                </View>
                <View style={styles.miniTitle}>

                </View>
            </View>

     

    );
}

export function CircleSmallTitle() {

    return (

            <View style={styles.boxCircle}>
                <View style={styles.circleSmall}>

                </View>
                <View style={styles.miniTitleSmall}>

                </View>
            </View>

     

    );
}

export function CircleSmall() {

    return (

            <View style={styles.boxCircle}>
                <View style={styles.circleMini}>

                </View>
            </View>

     

    );
}