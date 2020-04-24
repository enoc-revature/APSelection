import { Component, OnInit } from '@angular/core';
import { TimeToWordsService } from './time-to-words.service';

@Component({
  selector: 'app-time-to-words',
  templateUrl: './time-to-words.component.html',
  styleUrls: ['./time-to-words.component.css']
})
export class TimeToWordsComponent implements OnInit {

  constructor(private ttws: TimeToWordsService) { }

  ngOnInit(): void {
  }

  words: string;

  submit(): void {
    this.ttws.getWords(this.ttws.obj).subscribe(words => {this.words = words;})
  }
}
