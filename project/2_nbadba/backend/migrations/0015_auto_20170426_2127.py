# -*- coding: utf-8 -*-
# Generated by Django 1.11 on 2017-04-26 21:27
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('backend', '0014_auto_20170426_2127'),
    ]

    operations = [
        migrations.AlterField(
            model_name='team',
            name='home_city',
            field=models.CharField(max_length=20),
        ),
    ]
