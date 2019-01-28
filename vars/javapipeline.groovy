#!/usr/bin/env groovy

def call()
{
  pipeline {
      agent any

      stages {
          stage('Build') {
              steps {
                  echo "in build stage"
              }
          }
          stage('Test') {
              steps {
                  echo "in test stage"
              }
          }
          stage('Deliver') {
              steps {
                  echo "in delivery stage"
              }
          }
      }
  }
}